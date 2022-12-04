// accessing elements of an array
pragma solidity ^0.5.0;

// Creating a contract
contract Access_ArrayElement {
    // Declaring an array and
    // access values from the array
    // from a specific index
    uint256[6] data;
    uint256 x;

    function array_example() public {
        data = [uint256(10), 20, 30, 40, 50, 60];
        x = data[2];
    }

    // Defining function to
    function Access_element() public view returns (uint256[6] memory, uint256) {
        return (data, x);
    }
}
