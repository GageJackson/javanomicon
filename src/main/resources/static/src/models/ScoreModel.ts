class ScoreModel {
    id: number;
    quantity: number;
    quality: number;

    constructor(
            id: number,
            quantity: number,
            quality: number
    ) {
        this.id = id;
        this.quantity = quantity;
        this.quality = quality;
    }
}

export default ScoreModel;