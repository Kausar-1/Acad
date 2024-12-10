document.addEventListener('DOMContentLoaded', function() {
    fetch('https://dummyjson.com/products')
    .then(res => res.json())
    .then(data => {
        const products = data.products;
        const productContainer = document.getElementById('product-container');
        
        function displayProducts(products) {
            productContainer.innerHTML = '';  // Clear the container
            products.forEach(product => {
                const productDiv = document.createElement('div');
                productDiv.className = 'product';
            
                const productImage = document.createElement('img');
                productImage.src = product.thumbnail;
                productDiv.appendChild(productImage);
               
                const productTitle = document.createElement('h3');
                productTitle.textContent = product.title;
                productDiv.appendChild(productTitle);
                
                const productDescription = document.createElement('p');
                productDescription.textContent = product.description;
                productDiv.appendChild(productDescription);

                productDiv.addEventListener('click', () => showProductDetails(product));
            
                productContainer.appendChild(productDiv);
            });
        }
        
        displayProducts(products);  // Display all products initially

        function showProductDetails(product) {
            const modal = document.getElementById('product-modal');
            const modalDetails = document.getElementById('modal-details');
            const span = document.getElementsByClassName('close')[0];

            modalDetails.innerHTML = `
                <h2>${product.title}</h2>
                <img src="${product.thumbnail}" alt="${product.title}" style="width:100%">
                <p><strong>Description:</strong> ${product.description}</p>
                <p><strong>Price:</strong> $${product.price}</p>
                <p><strong>Rating:</strong> ${product.rating}</p>
                <p><strong>Stock:</strong> ${product.stock}</p>
                <p><strong>Brand:</strong> ${product.brand}</p>
                <p><strong>Category:</strong> ${product.category}</p>
            `;
            
            modal.style.display = 'block';

            span.onclick = function() {
                modal.style.display = 'none';
            }

            window.onclick = function(event) {
                if (event.target == modal) {
                    modal.style.display = 'none';
                }
            }
        }

        const searchButton = document.getElementById('search-button');
        searchButton.addEventListener('click', () => {
            const searchBar = document.getElementById('search-bar');
            const query = searchBar.value.toLowerCase();
            
            const filteredProducts = products.filter(product => 
                product.title.toLowerCase().includes(query) //||
                //product.description.toLowerCase().includes(query)
            );
            
            displayProducts(filteredProducts);
        });
    })
    .catch(error => console.error('Error fetching data:', error));
});
