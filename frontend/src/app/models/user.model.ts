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

export interface AgeInfo {
  name: string;
  age: number | null;
  count: number;
}

