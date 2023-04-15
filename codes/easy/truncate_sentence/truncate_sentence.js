/**
 * @param {string} s
 * @param {number} k
 * @return {string}
 */
var truncateSentence = function (s, k) {
    let sArr = s.split(' ')
    sArr = sArr.slice(0, k)

    return sArr.join(' ')
};