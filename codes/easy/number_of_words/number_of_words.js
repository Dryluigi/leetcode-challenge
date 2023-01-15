/**
 * @param {string[]} sentences
 * @return {number}
 */
var mostWordsFound = function (sentences) {
    let maximum = 0

    for (let i = 0; i < sentences.length; i++) {
        let count = sentences[i].split(" ").length

        if (maximum < count) {
            maximum = count
        }
    }

    return maximum
};