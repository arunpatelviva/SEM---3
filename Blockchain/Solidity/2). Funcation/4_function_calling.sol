pragma solidity ^0.5.0;

// Creating a contract
contract FunctionCalling {
    // Defining a public view function to demonstrate calling of sqrt function
    function add() public view returns (uint256) {
        uint256 num1 = 10;
        uint256 num2 = 16;
        uint256 sum = num1 + num2;
        return sqrt(sum); // calling function
    }

    //Defining public view sqrt function
    function sqrt(uint256 num) public view returns (uint256) {
        num = num**2;
        return num;
    }
}
