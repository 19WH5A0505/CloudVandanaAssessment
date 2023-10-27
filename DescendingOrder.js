const readline = require('readline');
const readline1 = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

function sortDescending(arr) 
{
    arr.sort(function(a, b)
    {
        return b - a;
    });
}

readline1.question("Enter the elements comma-separated: ", function(input) 
{
    const arr = input.split(',').map(Number);
    sortDescending(arr);
    console.log("Descending order: " + arr.join(', '));

});

