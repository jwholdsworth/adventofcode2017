'use strict';

const fs = require('fs')
let input = ''

fs.readFile(__dirname + '/input.txt', 'utf8', (err, data) => {
    console.log(calculate(data.toString().trim()))
})

function calculate(input) {
    let result = 0
    for (let i = 1; i < input.length; i++) {
        if (input.charAt(i) == input.charAt(i - 1)) {
            result += parseInt(input.charAt(i))
        }
    }

    if (input.charAt(0) == input.slice(-1)) {
        result += parseInt(input.charAt(0))
    }

    return result
}

module.exports = calculate
