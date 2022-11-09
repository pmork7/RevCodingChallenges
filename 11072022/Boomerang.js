function findBoomerangs(numArr) {
    let boomerangs = [];
    let i;
    for (i = 0; i <= numArr.length - 3; i++) {
        if (numArr[i] != numArr[i + 1] && numArr[i] == numArr[i + 2]) {
            let boomerang = [...numArr.slice(i, i + 3)];
            boomerangs.push(boomerang);
        }
    }
    return boomerangs;
}

function countBoomerangs(numArr) {
    let count = 0;
    let i;
    for (i = 0; i <= numArr.length - 3; i++) {
        if (numArr[i] != numArr[i + 1] && numArr[i] == numArr[i + 2]) {
            count++;
        }
    }
    return count;
}

let test1 = [3, 7, 3, 2, 1, 5, 1, 2, 2, -2, 2];
let test2 = [1, 7, 1, 7, 1, 7, 1];
let test3 = [9, 5, 9, 5, 1, 1, 1];
let test4 = [5, 6, 6, 7, 6, 3, 9];
let test5 = [4, 4, 4, 9, 9, 9, 9]

console.log(countBoomerangs(test1));
console.log(countBoomerangs(test2));
console.log(countBoomerangs(test3));
console.log(countBoomerangs(test4));
console.log(countBoomerangs(test5));