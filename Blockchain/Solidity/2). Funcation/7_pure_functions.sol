pragma solidity ^0.5.0;

// Defining a contract
contract pure_function {
    // Defining pure function to calculate product and sum of 2 numbers
    function getResult() public pure returns (uint256 product, uint256 sum) {
        uint256 num1 = 2;
        uint256 num2 = 4;
        product = num1 * num2;
        sum = num1 + num2;
        return (product, sum);
    }
}
