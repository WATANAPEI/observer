import Brain from "./brain";
import Stomach from "./stomach";

function main() {
    const brain = new Brain("normal");
    const stomach = new Stomach()
    brain.reportStatus();
    stomach.reportStatus();
    brain._status = "headache";
    brain.reportStatus();

}

main();