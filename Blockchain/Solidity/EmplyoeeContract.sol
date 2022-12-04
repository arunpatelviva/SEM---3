pragma solidity >=0.4.22 <0.5.0;

contract Employee {
    string public EmployeeName;
    string public EmployeeAddress;
    string public EmployeeDepartment;
    uint256 public EmployeeID;
    uint256 public EmployeeServiceYears;
    
    
    constructor (string memory NewEmployeeName,string memory NewEmployeeAddress,string memory NewEmployeeDepartment,uint256 NewEmployeeID,uint256 NewEmployeeServiceYears)public{
        EmployeeName=NewEmployeeName;
        EmployeeAddress=NewEmployeeAddress;
        EmployeeDepartment=NewEmployeeDepartment;
        EmployeeID=NewEmployeeID;
        EmployeeServiceYears=NewEmployeeServiceYears;
        
    }
 
    function  SetEmployeeDepartment(string memory NewEmployeeDepartment) public{
        EmployeeDepartment=NewEmployeeDepartment;
    }
    
    function  SetEmployeeYears(uint256 NewEmployeeServiceYears) public{
        EmployeeServiceYears=NewEmployeeServiceYears;
    }
    
    function GetEmployeeData() public view returns (string memory ,string memory ,string memory ,uint256 ,uint256 ){
        return(EmployeeName,EmployeeAddress,EmployeeDepartment,EmployeeID,EmployeeServiceYears);
    }
    
}
