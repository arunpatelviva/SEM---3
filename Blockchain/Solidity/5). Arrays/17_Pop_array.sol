// Pop operation
pragma solidity ^0.5.0;

// Creating a contract
contract Array_POP {
    // Defining an array
    uint256[] data = [10, 20, 30, 40, 50];

    // Defining a function to pop values from the array
    function array_pop() public returns (uint256[] memory) {
        data.pop();
    }

    function disp() public view returns (uint256[] memory) {
        return data;
    }
}
