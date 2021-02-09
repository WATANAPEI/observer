import Brain from "./brain";
import Stomach from "./stomach";
import Leg from "./leg";

function main() {
    const brain = new Brain();
    const stomach = new Stomach()
    const leg =  new Leg();

    // register brain to stomach observer
    stomach.addObserver(brain.setStomachache)

    brain.reportStatus();
    stomach.reportStatus();
    //brain._status = "headache";
    leg._status = "mascle pain";
    leg.reportStatus();
    brain.reportStatus(); // here brain must have some bad status.

}

main();