// creating a fixed-size array
pragma solidity ^0.5.0;

// Creating a contract
contract FixedSizeArray {
    // Declaring state variables
    // of type array
    uint256[6] data1;
    int256[5] data;

    // Defining function to add
    // values to an array
    function array_example() public {
        data = [int256(50), -63, 77, -28, 90];
        data1 = [uint256(10), 20, 30, 40, 50, 60];
    }

    function disp() public view returns (int256[5] memory, uint256[6] memory) {
        return (data, data1);
    }
}
