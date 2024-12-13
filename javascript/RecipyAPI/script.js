const recipeContainer = document.getElementById('recipe-container');
let allrecipes = [];

    fetch('https://dummyjson.com/recipes')
    .then(res => res.json())
    .then(data => {
        console.log(data.recipes);
        allrecipes = data.recipes;
        displayRecipes(allrecipes);
    })
    .catch(error => console.error('Error fetching data:', error));


    function displayRecipes(recipes) {
        recipeContainer.innerHTML = '';  // Clear the container
        recipes.forEach(recipe => {
            const recipeDiv = document.createElement('div');
            recipeDiv.classList.add('recipe');
           recipeDiv.innerHTML=`
           <img src="${recipe.image}">
           <h2>${recipe.name}</h2>

           `

            
            recipeContainer.appendChild(recipeDiv);
        });
    }

   
    const SearchBar = document.querySelector('.search-bar');
    SearchBar.addEventListener('input',()=>{
        const searchInput = SearchBar.value;
        const query = SearchBar.value.toLowerCase();
            
            const filteredProducts = allrecipes.filter(product => 
                allrecipes.title.toLowerCase().includes(query) ||
                allrecipes.description.toLowerCase().includes(query)
            );
        displayRecipes(filteredProducts)
    });
