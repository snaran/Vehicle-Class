public class AgencyRates
{
        private CarRates car_rate;
        private SUVRates suv_rate;
        private TruckRates truck_rate;

        public AgencyRates() {
            car_rate = new CarRates();
            suv_rate = new SUVRates();
            truck_rate = new TruckRates();
        }

        public Rates getCarRate()
        {
            return car_rate;
        }

        public Rates getSUBRate()
        {
            return suv_rate;
        }

        public Rates getTruckRate()
        {
            return truck_rate;
        }
}

