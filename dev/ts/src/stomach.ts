type hook = () => void;

export default class Stomach {
    _status: string[] = [];
    _observer: hook[] = []; // hook function
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

    public addObserver(hook: hook) {
        this._observer.push(hook);
    }

    public removeObserver(hook: hook) {
        this._observer.filter(o => o != hook);
    }

    private setStomachache() {
        this._status.push("stomachache");
        this.notify();
    }

    // call notify to hook registered function
    private notify() {
        this._observer.forEach(func => {
            func();
        })
    }


}