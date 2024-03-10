class BrewDetailModel {
    id: number;
    brewLocation: string;
    brewProcess: string;
    brewType: string;

    constructor(
        id: number,
        brewLocation: string,
        brewProcess: string,
        brewType: string
    ) {
        this.id = id;
        this.brewLocation = brewLocation;
        this.brewProcess = brewProcess;
        this.brewType = brewType;
    }
}
export default BrewDetailModel;