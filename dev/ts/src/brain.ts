export default class Brain {
    _status: string
    constructor(private status?: string) {
        this._status = status;
    }
    reportStatus = () => {
        if(this._status == undefined) {
            console.log(`I am ok.`);
        } else {
            console.log(`I have ${this._status}`);
        }
    }

    public setStomachache = () => {
        this._status = "stomachache";
    }

}