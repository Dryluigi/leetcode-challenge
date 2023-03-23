/**
 * @param {string[]} garbage
 * @param {number[]} travel
 * @return {number}
 */
var garbageCollection = function (garbage, travel) {
    let result = 0
    const types = ['M', 'P', 'G']

    for (let i = 0; i < types.length; i++) {
        let lastPickup = 0

        for (let j = 0; j < garbage.length; j++) {
            if (garbage[j].includes(types[i])) {
                lastPickup = j

                for (let k = 0; k < garbage[j].length; k++) {
                    if (garbage[j].charAt(k) === types[i]) {
                        result++
                    }
                }
            }
        }

        if (lastPickup > 0) {
            for (let j = 0; j < lastPickup; j++) {
                result += travel[j]
            }
        }
    }

    return result
};