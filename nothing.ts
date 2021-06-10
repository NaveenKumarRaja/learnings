class employee{
    private id;
    public empname;
    private dob;
    private department;
    constructor(){
        this.id  ;
        this.empname  ;
        this.dob  ;
        this.department  ;
    }
    protected details() : string{
        return 'ID = ${this.id} Name = ${this.empname} DOB = ${this.dob} Department = ${this.department}';
    }
}
class manager extends employee{
    private jobrole;
    constructor(){
        super();
    }
    public manager_details() : void {
        console.log('${super.details()} Jobrole = ${this.jobrole}');
    }
}
const emp1 = new manager ();