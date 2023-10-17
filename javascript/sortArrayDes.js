// 2.Perform sorting of an array in descending order.


const input_str = prompt("Enter a list of numbers separated by spaces:");


const input_list = input_str.split(' ');

try {
    
    const numbers = input_list.map(num => parseInt(num, 10));

    
    const sorted_numbers = numbers.sort((a, b) => b - a);

    
    console.log("Sorted array in descending order: " + sorted_numbers.join(' '));

} catch (error) {
    console.log("Invalid input. Please enter numbers separated by spaces.");
}
