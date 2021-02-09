export default class leg {
    _status: string
    constructor(private status?: string) {
        this._status = status;
    }

    reportStatus = () => {
        if(this._status == undefined) {
            console.log(`Leg is ok.`);
        } else {
            console.log(`Leg has ${this._status}`);
        }
    }
}