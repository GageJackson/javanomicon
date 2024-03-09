class TastingModel {
    id: number;
    tastingDate: Date;
    overallScore: string;
    description: string;
    tastingFlavors: string[];
    scoreAcidity: scoreModel;
    scoreAroma: scoreModel;
    scoreBalance: scoreModel;
    scoreBody: scoreModel;
    scoreFinish: scoreModel;
    scoreFlavor: scoreModel;
    scoreRoast: scoreModel;
    scoreSweetness: scoreModel;
    coffeeDetails: coffeeDetailModel[];
    brewDetails: brewDetailModel;

    constructor(
            id: number,
            tastingDate: Date,
            overallScore: string,
            description: string,
            tastingFlavors: string[],
            scoreAcidity: ScoreModel,
            scoreAroma: ScoreModel,
            scoreBalance: ScoreModel,
            scoreBody: ScoreModel,
            scoreFinish: ScoreModel,
            scoreFlavor: ScoreModel,
            scoreRoast: ScoreModel,
            scoreSweetness: ScoreModel,
            coffeeDetails: CoffeeDetailModel[],
            brewDetails: BrewDetailModel
    ) {
        this.id = id;
        this.tastingDate = tastingDate;
        this.overallScore = overallScore;
        this.description = description;
        this.tastingFlavors = tastingFlavors;
        this.scoreAcidity = scoreAcidity;
        this.scoreAroma = scoreAroma;
        this.scoreBalance = scoreBalance;
        this.scoreBody = scoreBody;
        this.scoreFinish = scoreFinish;
        this.scoreFlavor = scoreFlavor;
        this.scoreRoast = scoreRoast;
        this.scoreSweetness = scoreSweetness;
        this.coffeeDetails = coffeeDetails;
        this.brewDetails = brewDetails;
    }
}

export default TastingModel;