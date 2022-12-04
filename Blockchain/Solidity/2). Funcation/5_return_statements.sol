pragma solidity ^0.5.0;

// Creating a contract
contract Return_statement {
    // Defining a public view function to demonstrate return statement
    function return_example() public view returns ( uint256, uint256, uint256, string memory ) {
        uint256 num1 = 10;
        uint256 num2 = 16;
        uint256 sum = num1 + num2;
        uint256 prod = num1 * num2;
        uint256 diff = num2 - num1;
        string memory msg = "Multiple return values";
        return (sum, prod, diff, msg);
    }
}
