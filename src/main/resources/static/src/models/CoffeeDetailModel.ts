class CoffeeDetailModel{
    id: number;
    isSingleOrigin: boolean;
    isDecaf: boolean;
    coffeeRegion: string;
    coffeeCountry: string;
    coffeeProcess: string;

    constructor(
        id: number,
        isSingleOrigin: boolean,
        isDecaf: boolean,
        coffeeRegion: string,
        coffeeCountry: string,
        coffeeProcess: string
    ) {
        this.id = id;
        this.isSingleOrigin = isSingleOrigin;
        this.isDecaf = isDecaf;
        this.coffeeRegion = coffeeRegion;
        this.coffeeCountry = coffeeCountry;
        this.coffeeProcess = coffeeProcess;
    }
}

export default CoffeeDetailModel;