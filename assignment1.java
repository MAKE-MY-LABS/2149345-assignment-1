//write a function that takes in an array and returns a sorted arra
//y. Use the bubble sort algorithm to sort the array. The time complexity of this algorithm is O(n^2).
// The space complexity of this algorithm is O(1).

function bubbleSort(arr) {
  let n = arr.length;
  for (let i = 0; i < n; i++) {
    for (let j = 0; j < n - i - 1; j++) {
      if (arr[j] > arr[j + 1]) {
        let temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
      }
    }
  }
  return arr;
}

console.log(bubbleSort([5, 3, 8, 2, 1, 4])); // [1, 2, 3, 4, 5, 8]  // 6 elements
console.log(bubbleSort([9, 7, 5, 3, 1, 2, 4, 6, 8, 10])); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]  // 10 elements

//write insertion sort algorithm code here

function insertionSort(arr){
  let n = arr.length;
  for (let i = 1; i < n; i++) {
    let key = arr[i];
    let j = i - 1;
    while (j >= 0 && arr[j] > key) {
      arr[j + 1] = arr[j];
      j = j - 1;
    }
    arr[j + 1] = key;
  }
  return arr;
}

console.log(insertionSort([5, 3, 8, 2, 1, 4])); // [1, 2, 3, 4, 5, 8]  // 6 elements
console.log(insertionSort([9, 7, 5, 3, 1, 2, 4, 6, 8, 10])); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]  // 10 elements
console.log(insertionSort([9, 7, 5, 3, 1, 2, 4, 6, 8, 10, 0])); // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]  // 11 elements


//write binary search algorithm code here

function binarySearch(arr, x) {
  let start = 0;
  let end = arr.length - 1;
  while (start <= end) {
    let mid = Math.floor((start + end) / 2);
    if (arr[mid] === x) return mid;
    else if (arr[mid] < x) start = mid + 1;
    else end = mid - 1;
  }
  return -1;
}

console.log(binarySearch([1, 2, 3, 4, 5, 8], 5)); // 4