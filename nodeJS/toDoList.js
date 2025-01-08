// const readline = require('readline');
// const fs = require('fs');

// const rl = readline.createInterface({
//     input: process.stdin,
//     output: process.stdout
// });

// function displayMenu() {
//     console.log("Choose what you want to do: \n1. Read List\n2. Add Item\n3. Delete List\n4. Exit");
// }

// function readList() {
//     try {
//         const data = fs.readFileSync("./toDo.txt", 'utf-8');
//         console.log(data ? data : "List is empty.");
//     } catch (err) {
//         if (err.code === 'ENOENT') {
//             console.log("List is empty.");
//         } else {
//             throw err;
//         }
//     }
//     mainMenu();  // Return to main menu
// }

// function addItem() {
//     rl.question("Enter item to add to the list (or type 'exit' to stop): ", (item) => {
//         if (item.toLowerCase() === 'exit') {
//             mainMenu();  // Return to main menu
//         } else {
//             try {
//                 fs.appendFileSync("./toDo.txt", item + "\n");
//                 console.log("Item added.");
//             } catch (err) {
//                 throw err;
//             }
//             mainMenu();  // Return to main menu
//         }
//     });
// }

// function deleteList() {
//     try {
//         fs.unlinkSync("./toDo.txt");
//         console.log("List deleted.");
//     } catch (err) {
//         if (err.code === 'ENOENT') {
//             console.log("List does not exist.");
//         } else {
//             throw err;
//         }
//     }
//     mainMenu();  // Return to main menu
// }

// function mainMenu() {
//     displayMenu();
//     rl.question("", (choice) => {
//         if (choice === '1') {
//             readList();
//         } else if (choice === '2') {
//             addItem();
//         } else if (choice === '3') {
//             deleteList();
//         } else if (choice === '4') {
//             console.log("Exiting application...");
//             rl.close();
//         } else {
//             console.log("Invalid choice. Please select a valid option.");
//             mainMenu();  // Return to main menu
//         }
//     });
// }

// mainMenu();

const fs = require('fs');
const readline = require('readline');

const filePath = 'toDo.txt';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

// Display menu options
function displayMenu() {
  console.log(`
    1. Add item
    2. Delete item
    3. See items
    4. Exit
  `);
  rl.question('Choose an option: ', handleMenu);
}

// Handle menu options
function handleMenu(option) {
  switch(option) {
    case '1':
      rl.question('Enter the item: ', addItem);
      break;
    case '2':
      rl.question('Enter the item to delete: ', deleteItem);
      break;
    case '3':
      seeItems();
      break;
    case '4':
      rl.close();
      break;
    default:
      console.log('Invalid option, please try again.');
      displayMenu();
  }
}

// Add item to the list
function addItem(item) {
  fs.appendFile(filePath, item + '\n', (err) => {
    if (err) throw err;
    console.log('Item added!');
    displayMenu();
  });
}

// Delete item from the list
function deleteItem(item) {
  fs.readFile(filePath, 'utf-8', (err, data) => {
    if (err) throw err;
    const items = data.split('\n').filter(line => line.trim() !== item);
    fs.writeFile(filePath, items.join('\n'), (err) => {
      if (err) throw err;
      console.log('Item deleted!');
      displayMenu();
    });
  });
}

// See all items in the list
function seeItems() {
  fs.readFile(filePath, 'utf-8', (err, data) => {
    if (err) throw err;
    const items = data.split('\n').filter(line => line.trim());
    console.log('\nTo-Do List:');
    items.forEach((item, index) => {
      console.log(`${index + 1}. ${item}`);
    });
    displayMenu();
  });
}

// Start the program
displayMenu();

