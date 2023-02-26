/**
 * @param {string} key
 * @param {string} message
 * @return {string}
 */
var decodeMessage = function (key, message) {
    let map = {}
    let asciiStart = 97
    let result = ''

    for (let i = 0; i < key.length; i++) {
        if (key.charAt(i) !== ' ' && map[key.charAt(i)] === undefined) {
            map[key.charAt(i)] = String.fromCharCode(asciiStart++)
        }
    }

    for (let i = 0; i < message.length; i++) {
        if (message.charAt(i) === ' ') {
            result += message.charAt(i)
        } else {
            result += map[message.charAt(i)]
        }
    }

    return result
};