pragma solidity ^0.5.0;

// Creating a contract
contract WhileloopDemo {
    // Declaring a dynamic array
    uint256[] data;
    // Declaring state variable
    uint8 j = 0;

    // Defining a function to demonstrate While loop'
    function loop() public {
        while (j < 5) {
            j++;
            data.push(j);
        }
    }

    function disp() public view returns (uint256[] memory) {
        return data;
    }
}
