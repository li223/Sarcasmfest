const specialSymbols = [" ", ".", ",", "?", "!", "'"];
var text = "this does not align with our core values".split("");

for (let i = 0, j = 0; i < text.length; i++) {
    if(specialSymbols.includes(text[i])) {
        continue;
    }
    
    if(j % 2 == 0)
        text[i] = text[i].toLowerCase();
    else
        text[i] = text[i].toUpperCase();
    
    j++;
}

console.log(text.join(""));