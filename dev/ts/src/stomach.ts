export default class Stomach {
    _status: string[] = [];
    constructor(private status?: string) {
        if(status !== undefined) {
            this._status.push(status);
        }
    }
    reportStatus() {
        //console.log(this._status.length);
        if(this._status.length == 0) {
            console.log(`Stomach is ok.`);
        } else {
            this._status.forEach(e => {
                console.log(`Stomach has ${e}`);
            })
        }
    }

}