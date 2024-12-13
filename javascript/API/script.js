document.addEventListener('DOMContentLoaded', function() {
    fetch('https://dummyjson.com/products')
    .then(res => res.json())
    .then(data => {
        const products = data.products;
        const categories = [...new Set(products.map(product => product.category))];
        const productContainer = document.getElementById('product-container');
        const mainPage = document.getElementById('main-page');
        const productDetailsPage = document.getElementById('product-details-page');
        const productDetails = document.getElementById('product-details');
        const backButton = document.getElementById('back-button');
        const categoryFilter = document.getElementById('category-filter');

        function populateCategories(categories) {
            categories.forEach(category => {
                const option = document.createElement('option');
                option.value = category;
                option.textContent = category.charAt(0).toUpperCase() + category.slice(1);
                categoryFilter.appendChild(option);
            });
        }

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
        populateCategories(categories);  // Populate categories in filter

        function showProductDetails(product) {
            mainPage.classList.add('hidden');
            productDetailsPage.classList.remove('hidden');

            productDetails.innerHTML = `
                <h2>${product.title}</h2>
                <img src="${product.thumbnail}" alt="${product.title}" style="width:100%">
                <p><strong>Description:</strong> ${product.description}</p>
                <p><strong>Price:</strong> $${product.price}</p>
                <p><strong>Rating:</strong> ${product.rating}</p>
                <p><strong>Stock:</strong> ${product.stock}</p>
                <p><strong>Brand:</strong> ${product.brand}</p>
                <p><strong>Category:</strong> ${product.category}</p>
            `;
        }

        backButton.addEventListener('click', () => {
            productDetailsPage.classList.add('hidden');
            mainPage.classList.remove('hidden');
        });

        categoryFilter.addEventListener('change', () => {
            const selectedCategory = categoryFilter.value;
            const filteredProducts = selectedCategory === 'all'
                ? products
                : products.filter(product => product.category === selectedCategory);

            displayProducts(filteredProducts);
        });

        const searchButton = document.getElementById('search-button');
        searchButton.addEventListener('click', () => {
            const searchBar = document.getElementById('search-bar');
            const query = searchBar.value.toLowerCase();
            
            const filteredProducts = products.filter(product => 
                product.title.toLowerCase().includes(query) ||
                product.description.toLowerCase().includes(query)
            );
            
            displayProducts(filteredProducts);
        });
    })
    .catch(error => console.error('Error fetching data:', error));
});
