type changeStaus = (status: string) => void;

export default class Stomach {
    _status: string[] = [];
    _observer: changeStaus[] = []; // hook function
    constructor(private status?: string) {
        if(status !== undefined) {
            this._status.push(status);
        }
    }
    reportStatus() {
        console.log("***stomach status***")
        if(this._status.length == 0) {
            console.log(`Stomach is ok.`);
        } else {
            this._status.forEach(e => {
                console.log(`Stomach has ${e}`);
            })
        }
    }

    public addObserver(hook: changeStaus) {
        this._observer.push(hook);
    }

    public removeObserver(hook: changeStaus) {
        this._observer.filter(o => o != hook);
    }

    public setStomachache() {
        console.log("***stomach got pain***")
        const status = "stomachache";
        this._status.push(status);
        this.notify(status);
    }

    // call notify to hook registered function
    private notify(status: string) {
        this._observer.forEach(func => {
            func(status);
        })
    }


}