class CoffeeDetailModel{
    isSingleOrigin: boolean;
    isDecaf: boolean;
    coffeeRegion: string;
    coffeeCountry: string;
    coffeeProcess: string;

    constructor(
        isSingleOrigin: boolean,
        isDecaf: boolean,
        coffeeRegion: string,
        coffeeCountry: string,
        coffeeProcess: string
    ) {
        this.isSingleOrigin = isSingleOrigin;
        this.isDecaf = isDecaf;
        this.coffeeRegion = coffeeRegion;
        this.coffeeCountry = coffeeCountry;
        this.coffeeProcess = coffeeProcess;
    }
}

export default CoffeeDetailModel;