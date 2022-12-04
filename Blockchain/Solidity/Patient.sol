pragma solidity >=0.4.22 <0.5.0;

contract  HealthRecord {
    string public PatientName;
    string public PatientDoctor;
    string public PatientMedicine;
    string public PatientDisease;
    uint256 public PatientConsulationFees;
    
    
    constructor (string memory NewPatientName,string memory NewPatientDoctor,string memory NewPatientMedicine,string memory NewPatientDisease,uint256 NewPatientConsulationFees)public{
        PatientName=NewPatientName;
        PatientDoctor=NewPatientDoctor;
        PatientMedicine=NewPatientMedicine;
        PatientDisease=NewPatientDisease;
        PatientConsulationFees=NewPatientConsulationFees;
        
    }
 
    function  SetPatientData(string memory SetPatientDisease,string memory SetPatientMedicine,uint256 SetPatientConsulationFees) public{
        PatientDisease=SetPatientDisease;
        PatientMedicine=SetPatientMedicine;
        PatientConsulationFees=SetPatientConsulationFees;
    }
    

    
    function GetPatientData() public view returns (string memory ,string memory ,string memory ,string memory,uint256 ){
        return(PatientName,PatientDoctor,PatientMedicine,PatientDisease,PatientConsulationFees);
    }
    
}
