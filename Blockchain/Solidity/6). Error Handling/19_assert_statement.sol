// Solidity program to demonstrate assert statement
pragma solidity ^0.5.0;

// Creating a contract
contract assertStatement {
    // Defining a state variable
    bool result;

    // Defining a function to check condition
    function checkOverflow(uint256 _num1, uint256 _num2) public {
        uint256 sum = _num1 + _num2;
        assert(sum <= 255);
        result = true;
    }

    // Defining a function to print result of assert statement
    function getResult() public view returns (string memory) {
        if (result == true) {
            return ("No Overflow");
        } else {
            return ("Overflow exist");
        }
    }
}
