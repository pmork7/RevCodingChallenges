function doesTriangleFit(t1, t2) {
    let calculateArea = arr => {
        let p = arr.reduce((a, c) => a + c) / 2; // p is the perimeter of the triangle
        return Math.sqrt(p * (p - arr[0]) * (p - arr[1]) * (p - arr[2]));
    }
    return calculateArea(t1) === 0 || calculateArea(t2) === 0 ? false : calculateArea(t1) <= calculateArea(t2);
}

console.log(doesTriangleFit([1, 1, 1], [1, 1, 1]));
console.log(doesTriangleFit([1, 1, 1], [2, 2, 2]));
console.log(doesTriangleFit([1, 2, 3], [1, 2, 2]));
console.log(doesTriangleFit([1, 2, 4], [1, 2, 6]));