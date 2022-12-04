pragma solidity ^0.5.0;

// Creating a contract
contract DoWhile {
    // Declaring a dynamic array
    uint256[] data;
    // Declaring state variable
    uint8 j = 0;

    // Defining function to demonstrate 'Do-While loop'
    function loop() public {
        do {
            j++;
            data.push(j);
        } while (j < 5);
    }

    function disp() public view returns (uint256[] memory) {
        return data;
    }
}
