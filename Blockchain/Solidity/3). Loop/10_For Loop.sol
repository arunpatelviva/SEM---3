pragma solidity ^0.5.0;

// Creating a contract
contract ForloopDemo {
    // Declaring a dynamic array
    uint256[] data;

    // Defining a function to demonstrate 'For loop'
    function loop() public returns (uint256[] memory) {
        for (uint256 i = 0; i < 5; i++) {
            data.push(i);
        }
    }

    function disp() public view returns (uint256[] memory) {
        return data;
    }
}
