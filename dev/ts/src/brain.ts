export default class Brain {
    _status: string
    constructor(private status: string) {
        this._status = status;
    }
    reportStatus = () => {
        console.log(`I am ${this._status}`);
    }

}