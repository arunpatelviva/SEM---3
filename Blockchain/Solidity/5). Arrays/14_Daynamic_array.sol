// creating a dynamic array
pragma solidity ^0.5.0;

// Creating a contract
contract Types {
    // Declaring state variable
    // of type array. One is fixed-size
    // and the other is dynamic array
    uint256[] data = [10, 20, 30, 40, 50];
    int256[] data1;

    // Defining function to
    // assign values to dynamic array
    function dynamic_array() public {
        data1 = [int256(-60), 70, -80, 90, -100, -120, 140];
    }

    function disp() public view returns (uint256[] memory, int256[] memory) {
        return (data, data1);
    }
}
