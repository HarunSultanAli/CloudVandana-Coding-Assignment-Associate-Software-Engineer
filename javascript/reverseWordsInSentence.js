// 1. Take a sentence as an input and reverse every word in that sentence. Example - This is a sunny day > shiT si a ynnus yad.

function reverseWordsInSentence(sentence) {
    
    const words = sentence.split(' ');
  
    
    const reversedWords = words.map(word => word.split('').reverse().join(''));
  
    
    const reversedSentence = reversedWords.join(' ');
  
    return reversedSentence;
  }
  
  
  const inputSentence = prompt("Enter a sentence:");
  
  
  const reversedSentence = reverseWordsInSentence(inputSentence);
  
  
  console.log("Reversed sentence: " + reversedSentence);
  