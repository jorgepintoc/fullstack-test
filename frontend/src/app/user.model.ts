export interface User {
  uuid: string;
  fullName: string;
  email: string;
  pictureUrl: string;
}

export interface CombinedResponse {
  user: User;
  dogImageUrl: string;
}