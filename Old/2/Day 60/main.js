
// Define the number of rows
const rows = 5;

// Loop through each row
for (let i = 1; i <= rows; i++) {
  // Create an empty string to hold the stars for this row
  let stars = '';

  // Loop through each column in this row
  for (let j = 1; j <= i; j++) {
    // Add a star to the string
    stars += '*';
  }

  // Print the stars for this row
  console.log(stars);
}
