var missingNumber = function (nums) {
    let hashSet = {};

    nums.forEach(num => {
        hashSet[num] = 1;
    });

    for (let i = 0; i < nums.length + 1; i++) {
        if (!hashSet.hasOwnProperty(i)) {
            return i;
        }
    }
};