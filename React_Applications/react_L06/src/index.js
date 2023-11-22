// ES6 syntax
var filtered = car => {
    return car.name === 'ford';
  };
  const arr1 = [
    { name: 'chevy', count: 2 },
    { name: 'ford', count: 5 },
    { name: 'acura', count: 3 },
    { name: 'honda', count: 16 }
  ].filter(filtered);
  
  console.log("Filter results:", arr1);
  
  const arr2 = ['Bill', 'Joe', 'Emily', 'Andrea'];
  const newStudents = ['Andrew', 'Tasha', 'Carol', 'George'];
  
  const fullArray = [...arr2, ...newStudents];
  
  console.log(fullArray);