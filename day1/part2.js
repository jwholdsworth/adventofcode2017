'use strict';

const fs = require('fs')
let input = ''

fs.readFile(__dirname + '/input.txt', 'utf8', (err, data) => {
    console.log(part2(data.toString().trim()))
})

function part2(input) {
    let result = 0
    let oppositeNumber
    for (let i = 0; i < input.length; i++) {
        if (i < input.length / 2) {
            oppositeNumber = parseInt(input.charAt(i + (input.length / 2)))
        } else {
            oppositeNumber = parseInt(input.charAt(i - (input.length / 2)))
        }

        if (oppositeNumber == parseInt(input.charAt(i))) {
            result += parseInt(input.charAt(i))
        }
    }

    return result
}

module.exports = part2
