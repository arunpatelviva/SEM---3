// Push operation
pragma solidity ^0.5.0;

// Creating a contract
contract Array_Push {
    // Defining the array
    uint256[] data = [10, 20, 30, 40, 50];

    // Defining the function to push
    // values to the array
    function array_push() public returns (uint256[] memory) {
        data.push(60);
        data.push(70);
        data.push(80);
    }

    function disp() public view returns (uint256[] memory) {
        return data;
    }
}
