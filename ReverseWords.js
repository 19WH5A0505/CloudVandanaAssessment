const str = prompt("Enter the String:");
console.log(str + " > " + revWords(str));

function revWords(str)
{
    const words = str.split(' ');
    const revWords = words.map(function (word)
    {
        return word.split('').reverse().join('');
    });
    const revSentence = revWords.join(' ');
    return revSentence;
}

