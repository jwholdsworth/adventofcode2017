'use strict'

const expect = require('chai').expect
const calculate = require('./part1')
const part2 = require('./part2')

describe('part1', () => {
    it('should calculate 1122 as 3', () => {
        let result = calculate('1122')
        expect(result).to.be.equal(3)
    })

    it('should calculate 1111 as 4', () => {
        let result = calculate('1111')
        expect(result).to.be.equal(4)
    })

    it('should calculate 1234 as 0', () => {
        let result = calculate('1234')
        expect(result).to.be.equal(0)
    })

    it('should calculate 91212129 as 9', () => {
        let result = calculate('91212129')
        expect(result).to.be.equal(9)
    })
})

describe('part2', () => {
    it('should calculate 1212 as 6', () => {
        let result = part2('1212')
        expect(result).to.be.equal(6)
    })

    it('should calculate 1221 as 0', () => {
        let result = part2('1221')
        expect(result).to.be.equal(0)
    })

    it('should calculate 123425 as 4', () => {
        let result = part2('123425')
        expect(result).to.be.equal(4)
    })

    it('should calculate 123123 as 12', () => {
        let result = part2('123123')
        expect(result).to.be.equal(12)
    })

    it('should calculate 12131415 as 4', () => {
        let result = part2('12131415')
        expect(result).to.be.equal(4)
    })
})

