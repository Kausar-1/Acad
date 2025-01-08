/* const fs = require('fs');
// write to files snychronously
fs.writeFileSync("./myFile.txt","File created"+"\n");

// Append to file snchronously
fs.appendFileSync("./myFile.txt","Md Kausar Nizam"+"\n");
fs.appendFileSync("./myFile.txt", "Bca final year"+"\n");
fs.appendFileSync("./myFile.txt", "Silicon Academy"+"\n");
fs.appendFileSync("./myFile.txt", "Gopalganj"+"\n");

// Read from files synchronously
const res = fs.readFileSync("./myFile.txt",'utf-8');

console.log(res);  */


const fs = require('fs');
 
//Write to files asynchronously
fs.writeFile("./myFile2.txt"," File2 created"+"\n", (err) => {
    if(err) throw err;
    console.log("File2 Created");
    
    //Append to file asynchronously after the file is created
    fs.appendFile("./myFile2.txt","Md Kausar Nizam"+"\n",(err) => {
        if(err) throw err;
        console.log("one item appended \n");
    });
    
    fs.appendFile("./myFile2.txt","BCA 3rd yr"+"\n",(err) => {
        if(err) throw err;
        console.log("2nd item appended \n");
    });

    fs.appendFile("./myFile2.txt","Silicon Academy"+"\n",(err) => {
        if(err) throw err;
        console.log("3rd item appended \n");
    });

    fs.appendFile("./myFile2.txt","Gopalganj"+"\n",(err) => {
        if(err) throw err;
        console.log("4th item appended \n");
    });

    //Read from files asynchronously
    fs.readFile("./myFile2.txt",'utf-8',(err,res) => {
        if(err) throw err;
        console.log(res);
    });

    // Delete files asynchronously 
    
});














// const { log } = require('console');
// const fs = require('fs');

// fs.writeFile("./myFile2.txt", "File2 created", (err) => {
//     if (err) throw err;
//     console.log("File2 created");
// });
// fs.writeFileSync("./myFile.txt", "File created");  // to create file
// fs.appendFileSync("./myFile.txt", " Silicon Academy");  
// fs.appendFile("./myFile.txt", " Gopalganj", (err) => {
//     if (err) throw err;
//     console.log("Gopalganj appended");
// });

// fs.readFile("./myFile.txt", 'utf-8', (err, data) => {
//     if (err) throw err;
//     console.log(data);  // Logs the file content asynchronously
// });

// const res = fs.readFileSync("./myFile.txt", 'utf-8');
// console.log(res);  // Logs the content synchronously
// console.log("Before");
// fs.readFile("myFile2.txt", 'utf-8', (err, result) => {  
//     if (err) throw err;
//     console.log(result);
// });
// fs.readFile("myFile.txt", 'utf-8', (err, result) => {  
//     if (err) throw err;
//     console.log(result);
// });
// console.log("After");

// // fs.unlinkSync("./myFile.txt");  // to delete file
// console.log(res);
