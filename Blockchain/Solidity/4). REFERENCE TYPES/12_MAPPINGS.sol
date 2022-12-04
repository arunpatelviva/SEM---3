pragma solidity >=0.7.0 <0.8.0;

contract MarksMgtSys {
    // create a struct for students
    struct Student {
        int256 Id;
        string FName;
        string LName;
        int256 Marks;
    }
    int256 public stdCount = 0;
    mapping(int256 => Student) public stdRecord;

    // function to add Record
    function addNewRec(
        int256 _Id,
        string memory _FName,
        string memory _LName,
        int256 _Marks
    ) public {
        stdCount = stdCount + 1;
        stdRecord[stdCount] = Student(_Id, _FName, _LName, _Marks);
    }
}
