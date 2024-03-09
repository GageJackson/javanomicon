class BrewDetailModel {
    brewLocation: string;
    brewProcess: string;
    brewType: string;

    constructor(
        brewLocation: string,
        brewProcess: string,
        brewType: string
    ) {
        this.brewLocation = brewLocation;
        this.brewProcess = brewProcess;
        this.brewType = brewType;
    }
}
export default BrewDetailModel;